// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer hat2;
	private final ModelRenderer hat3;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -32.0F, -4.0F, 8, 8, 8, 0.0F, false));

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(hat);
		hat.cubeList.add(new ModelBox(hat, 0, 0, -6.0F, -32.0F, -6.0F, 12, 1, 12, 0.0F, false));

		hat2 = new ModelRenderer(this);
		hat2.setRotationPoint(0.0F, -3.0F, 0.0F);
		hat.addChild(hat2);
		hat2.cubeList.add(new ModelBox(hat2, 0, 14, -4.0F, -32.0F, -4.0F, 8, 3, 8, 0.0F, false));

		hat3 = new ModelRenderer(this);
		hat3.setRotationPoint(0.0F, -3.0F, 0.0F);
		hat2.addChild(hat3);
		hat3.cubeList.add(new ModelBox(hat3, 33, 14, -2.5F, -34.0F, -3.0F, 5, 5, 6, 0.0F, false));
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