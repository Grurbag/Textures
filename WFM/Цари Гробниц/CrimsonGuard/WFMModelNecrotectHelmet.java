// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer helmet_1;
	private final ModelRenderer helmet_2;
	private final ModelRenderer helmet_2_r1;
	private final ModelRenderer helmet_3;
	private final ModelRenderer helmet_2_r2;
	private final ModelRenderer overlay;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		helmet_1 = new ModelRenderer(this);
		helmet_1.setRotationPoint(0.0F, -1.0F, -2.0F);
		head.addChild(helmet_1);
		setRotationAngle(helmet_1, -0.3491F, 0.0F, 0.0F);
		helmet_1.cubeList.add(new ModelBox(helmet_1, 0, 18, -3.5F, -13.0F, -4.0F, 7, 7, 7, 0.0F, false));

		helmet_2 = new ModelRenderer(this);
		helmet_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet_1.addChild(helmet_2);
		setRotationAngle(helmet_2, -0.3491F, 0.0F, 0.0F);
		

		helmet_2_r1 = new ModelRenderer(this);
		helmet_2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet_2.addChild(helmet_2_r1);
		setRotationAngle(helmet_2_r1, 0.6981F, 0.0F, 0.0F);
		helmet_2_r1.cubeList.add(new ModelBox(helmet_2_r1, 28, 20, -2.5F, -17.0F, 1.5F, 5, 7, 5, 0.0F, false));

		helmet_3 = new ModelRenderer(this);
		helmet_3.setRotationPoint(0.0F, -2.0F, -2.0F);
		helmet_2.addChild(helmet_3);
		

		helmet_2_r2 = new ModelRenderer(this);
		helmet_2_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet_3.addChild(helmet_2_r2);
		setRotationAngle(helmet_2_r2, 0.6981F, 0.0F, 0.0F);
		helmet_2_r2.cubeList.add(new ModelBox(helmet_2_r2, 48, 25, -1.5F, -18.0F, 2.5F, 3, 4, 3, 0.0F, false));

		overlay = new ModelRenderer(this);
		overlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		overlay.cubeList.add(new ModelBox(overlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		overlay.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}