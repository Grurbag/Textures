// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer overlay;
	private final ModelRenderer helmet_1;
	private final ModelRenderer helmet_2;
	private final ModelRenderer helmet_3;
	private final ModelRenderer helmet_3_r1;
	private final ModelRenderer head;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		overlay = new ModelRenderer(this);
		overlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		overlay.cubeList.add(new ModelBox(overlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		helmet_1 = new ModelRenderer(this);
		helmet_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		overlay.addChild(helmet_1);
		helmet_1.cubeList.add(new ModelBox(helmet_1, 0, 16, -3.0F, -10.0F, -3.0F, 6, 3, 6, 0.0F, false));

		helmet_2 = new ModelRenderer(this);
		helmet_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		overlay.addChild(helmet_2);
		helmet_2.cubeList.add(new ModelBox(helmet_2, 24, 18, -2.0F, -11.0F, -2.0F, 4, 1, 4, 0.0F, false));

		helmet_3 = new ModelRenderer(this);
		helmet_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		overlay.addChild(helmet_3);
		

		helmet_3_r1 = new ModelRenderer(this);
		helmet_3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet_3.addChild(helmet_3_r1);
		setRotationAngle(helmet_3_r1, 0.0F, 0.5672F, 0.0F);
		helmet_3_r1.cubeList.add(new ModelBox(helmet_3_r1, 40, 6, 0.0F, -20.0F, -1.0F, 0, 10, 10, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		overlay.render(f5);
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}