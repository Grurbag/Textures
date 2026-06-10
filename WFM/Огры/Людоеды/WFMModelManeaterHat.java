// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer hat1;
	private final ModelRenderer hat2;

	public custom_model() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -30.0F, -1.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -6.0F, -10.0F, -7.0F, 12, 12, 12, 0.0F, false));

		hat1 = new ModelRenderer(this);
		hat1.setRotationPoint(4.3971F, -13.0F, -3.616F);
		head.addChild(hat1);
		setRotationAngle(hat1, 0.0F, 2.618F, 0.0F);
		hat1.cubeList.add(new ModelBox(hat1, 40, 0, -5.3971F, -5.0F, 0.616F, 11, 10, 0, 0.0F, false));

		hat2 = new ModelRenderer(this);
		hat2.setRotationPoint(-5.5F, -13.0F, -4.0F);
		head.addChild(hat2);
		setRotationAngle(hat2, 0.0F, 0.5236F, 0.0F);
		hat2.cubeList.add(new ModelBox(hat2, 40, 0, -5.0F, -5.0F, 0.0F, 11, 10, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}