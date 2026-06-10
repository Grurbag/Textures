// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer hat2;
	private final ModelRenderer hat3;
	private final ModelRenderer bones;
	private final ModelRenderer bones2;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 4.0F, -2.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -7.0F, -5.0F, 8, 8, 8, 0.5F, false));

		hat = new ModelRenderer(this);
		hat.setRotationPoint(-1.0F, -4.0F, 0.0F);
		head.addChild(hat);
		hat.cubeList.add(new ModelBox(hat, 36, 21, -2.5F, -7.0F, -4.5F, 7, 4, 7, 0.0F, false));

		hat2 = new ModelRenderer(this);
		hat2.setRotationPoint(0.0F, -4.0F, 0.0F);
		hat.addChild(hat2);
		hat2.cubeList.add(new ModelBox(hat2, 15, 23, -1.5F, -7.0F, -3.5F, 5, 4, 5, 0.0F, false));

		hat3 = new ModelRenderer(this);
		hat3.setRotationPoint(0.0F, -4.0F, 0.0F);
		hat2.addChild(hat3);
		hat3.cubeList.add(new ModelBox(hat3, 0, 25, -0.5F, -7.0F, -2.5F, 3, 4, 3, 0.0F, false));

		bones = new ModelRenderer(this);
		bones.setRotationPoint(1.0F, -5.0F, -1.0F);
		hat2.addChild(bones);
		bones.cubeList.add(new ModelBox(bones, 36, 6, -7.0F, -2.0F, 0.0F, 14, 4, 0, 0.0F, false));

		bones2 = new ModelRenderer(this);
		bones2.setRotationPoint(1.0F, -9.0F, -1.0F);
		hat2.addChild(bones2);
		bones2.cubeList.add(new ModelBox(bones2, 36, 0, -6.0F, -2.0F, 0.0F, 12, 4, 0, 0.0F, false));
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