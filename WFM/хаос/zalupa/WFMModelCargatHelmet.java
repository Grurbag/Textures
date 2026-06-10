// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer overlay;
	private final ModelRenderer horns;
	private final ModelRenderer podborodok;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		overlay = new ModelRenderer(this);
		overlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(overlay);
		overlay.cubeList.add(new ModelBox(overlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		horns = new ModelRenderer(this);
		horns.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(horns);
		horns.cubeList.add(new ModelBox(horns, 0, 16, -8.5F, -17.0F, -4.4F, 17, 16, 0, 0.0F, false));

		podborodok = new ModelRenderer(this);
		podborodok.setRotationPoint(0.0F, 8.0F, -3.0F);
		head.addChild(podborodok);
		podborodok.cubeList.add(new ModelBox(podborodok, 46, 16, -4.0F, -9.0F, -1.5F, 8, 8, 0, 0.0F, false));
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